import React, { useEffect } from "react";
import axios from "axios";
import { useState } from "react";
import { Box, Typography } from "@mui/material";
import { styled } from "@mui/material/styles";

const JSONContainer = styled(Box)({
  backgroundColor: "#282c34",
  color: "#abb2bf",
  fontFamily: "Courier New, monospace",
  maxWidth: "600px",
  maxHeight: "400px",
  overflowY: "-moz-hidden-unscrollable",
  margin: "0 auto",
  lineHeight: "1.5",
});

const Key = styled(Typography)({
  color: "#e06c75", // red-ish color for keys
  fontFamily: "Consolas, Courier New, monospace",
  fontSize: "12px",
  component: "span",
});

const Value = styled(Typography)({
  color: "#98c379", // green-ish color for values
  display: "inline",
  fontFamily: "Consolas, Courier New, monospace",
  fontSize: "13px",
  component: "span",
});

const StringValue = styled(Typography)({
  color: "#61afef", // blue color for strings
  display: "inline",
  fontFamily: "Consolas, Courier New, monospace",
  fontSize: "13px",
  component: "span",
});

function LeetCodeStats() {
  const [easySolved, setEasySolved] = useState(0);
  const [mediumSolved, setMediumSolved] = useState(0);
  const [hardSolved, setHardSolved] = useState(0);

  useEffect(() => {
    axios
      .get("https://leetcode-stats-api.herokuapp.com/rolffffx")
      .then((response) => {
        const data = response.data;
        setEasySolved(data.easySolved);
        setMediumSolved(data.mediumSolved);
        setHardSolved(data.hardSolved);
      })
      .catch((error) => {
        console.error("There was an error fetching the data", error);
      });
  }, []);

  const [recentProblems, setRecentProblems] = useState([]);
  useEffect(() => {
    fetch("/log.txt")
      .then((response) => response.text())
      .then((text) => {
        const lines = text.trim().split("\n");
        const parsedLines = lines
          .slice(0, 5)
          .map((line) => {
            const parts = line.split("|");
            if (parts.length >= 3) {
              return {
                numberSolved: parts[1].trim(),
                questionName: parts[2].trim(),
              };
            }
            return null;
          })
          .filter(Boolean);
        setRecentProblems(parsedLines);
      })
      .catch((error) => {
        console.error("Error fetching the log file", error);
      });
  }, []);

  return (
    <JSONContainer>
      <Key component="span">{"{"}</Key>
      <Box pl={2}>
        <Key component="span">"progress": {"{"}</Key>
        <Box pl={2}>
          <div>
            <Key component="span">
              "easy": <Value component="span">{easySolved}</Value>,
            </Key>
          </div>
          <div>
            <Key component="span">
              "medium": <Value component="span">{mediumSolved}</Value>,
            </Key>
          </div>
          <div>
            <Key component="span">
              "hard": <Value component="span">{hardSolved}</Value>
            </Key>
          </div>
        </Box>
        <Key component="span">{"}"},</Key>
        <Key component="span">"recent_problems": {"["}</Key>
        <Box pl={2}>
          {recentProblems.map((problem, index) => (
            <Box key={index}>
              <Key component="span">{"{"}</Key>
              <Box pl={2}>
                <Key component="span">
                  "count":{" "}
                  <Value component="span">{problem.numberSolved}</Value>,
                </Key>
                <Key component="span">
                  "name":{" "}
                  <StringValue component="span">
                    "{problem.questionName}"
                  </StringValue>
                </Key>
              </Box>
              <Key component="span">
                {"}"}
                {index < recentProblems.length - 1 ? "," : ""}
              </Key>
            </Box>
          ))}
        </Box>
        <Key component="span">{"]"}</Key>
      </Box>
      <Key component="span">{"}"}</Key>
    </JSONContainer>
  );
}

export default LeetCodeStats;
