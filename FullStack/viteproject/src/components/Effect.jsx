import React from "react";
import { useEffect } from "react";
function Effect() {
  const [count, setCount] = React.useState(110);
  useEffect(() => {
    //setCount(200);
    console.log("useEffect called");
    }, []);
    return (
        <>
        <h1>{count}</h1>
        <button onClick={() => setCount(count + 1)}>Increzment</button>
        </>
    )
}
export default Effect;