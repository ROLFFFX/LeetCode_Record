import React, { useEffect } from "react";
import axios from "axios";
import { useState } from "react";
import styled from "styled-components";

const JSONContainer = styled.div`
  background: #282c34;
  color: #abb2bf;
  font-family: "Courier New", Courier, monospace;
  padding: 20px;
  border-radius: 5px;
  max-width: 400px;
  max-height: 400px;
  overflow-y: auto;
  margin: 0 auto;
  font-size: 14px;
  line-height: 1.5;
`;

const Key = styled.span`
  color: #e06c75; // red-ish color for keys
`;

const Value = styled.span`
  color: #98c379; // green-ish color for values
`;

const StringValue = styled.span`
  color: #61afef; // blue color for strings
`;

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
    <React.Fragment>
      <>
        <div style={{ border: 10 }}>
          <div>{easySolved}</div>
          <div>{mediumSolved}</div>
          <div>{hardSolved}</div>
        </div>
        <div>
          <ul>
            {recentProblems.map((problem, index) => (
              <li key={index}>
                <strong>Count:</strong> {problem.numberSolved}
                <br />
                <strong>Name:</strong> {problem.questionName}
              </li>
            ))}
          </ul>
        </div>
      </>
    </React.Fragment>
  );
}

export default LeetCodeStats;
