import React from "react";
const Array = () => {
  const names = ["Bala", "Ganesh", "Janardhanan", "Madhu"];
  return (
    <>
      <h1>Array</h1>

      <ul>
        {names.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>

      <table border="5" align="center">
        <thead>
          <tr>
            <th>S.No</th>
            <th>Name</th>
          </tr>
        </thead>
        <tbody>
          {names.map((data, i) => (
            <tr key={i}>
              <td>{i + 1}</td>
              <td>{data}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
};

export default Array;