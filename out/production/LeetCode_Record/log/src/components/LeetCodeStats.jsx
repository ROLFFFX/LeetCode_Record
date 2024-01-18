import React, { useEffect } from "react";
import axios from "axios";
import { useState } from "react";
import RecentProblems from "./RecentProblems";

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

  return (
    <React.Fragment>
      <>
        <div style={{ border: 10 }}>
          <div>{easySolved}</div>
          <div>{mediumSolved}</div>
          <div>{hardSolved}</div>
        </div>
        <div>
          <RecentProblems />
        </div>
      </>
    </React.Fragment>
  );
}

export default LeetCodeStats;
