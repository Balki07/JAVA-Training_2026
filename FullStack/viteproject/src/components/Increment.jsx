import React from "react";
import { useState } from "react";
const Increment = () => {
    const [count, setCount] = useState(0);
            if(count>10 || count<0){
                alert("Number can't be lesser thn 0 or Higher thn 10 ");
                setCount(0);
            }
        const handlePlus = () => {
            setCount(count + 1);
        }
        const handleMinus = () => {
            setCount(count - 1);
    }
    return (
        <>
            <button onClick={handlePlus}>ADD</button>
            <button onClick={handleMinus}>SUBTRACT</button>
            <h1>{count}</h1>
        </>
    )
}
export default Increment