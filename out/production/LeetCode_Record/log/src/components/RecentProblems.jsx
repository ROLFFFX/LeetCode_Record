import React, { useState, useEffect } from "react";

function RecentProblems() {
  const [recentProblems, setRecentProblems] = useState([]);

  useEffect(() => {
    fetch("/log.txt")
      .then((response) => response.text())
      .then((text) => {
        const lines = text.trim().split("\n");
        const parsedLines = lines
          .slice(-10)
          .reverse()
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
    <div>
      <h2>10 Most Recent Problems Solved</h2>
      <ul>
        {recentProblems.map((problem, index) => (
          <li key={index}>
            <strong>Problem solved number:</strong> {problem.numberSolved}
            <br />
            <strong>Question Name:</strong> {problem.questionName}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default RecentProblems;
