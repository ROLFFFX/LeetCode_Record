import React from "react";
import LeetCodeStats from "./components/LeetCodeStats";

export default function App() {
  return (
    <div
      style={{
        border: "1px solid black",
        maxHeight: "350px",
        maxWidth: "400px",
      }}
    >
      <LeetCodeStats />
    </div>
  );
}
