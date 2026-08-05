import React from "react";
import Hello from "./components/Hello.jsx";
import Bala from "./components/Bala.jsx";
import Array from "./components/List.jsx";
import Plus from "./components/Plus.jsx";
import Increment from "./components/Increment.jsx";
import Effect from "./components/Effect.jsx";
import "./App.css";

const App = () => {  
  return (
    <div>
      <Hello />
      <Bala />

      <img
        src="https://tse4.mm.bing.net/th/id/OIP.ao8mFIlgNb7bOdSki0rEhQHaFj?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"
        alt="Image 1"
      />

      <img
        src="https://tse2.mm.bing.net/th/id/OIP.yY38gdTH6k-GXSE-lDuiaQHaEK?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"
        alt="Image 2"
      />

      <img
        src="https://tse3.mm.bing.net/th/id/OIP.AIuxSl_KsX702eljG-xd-wHaEK?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"
        alt="Image 3"
      />

      <img
        src="https://www.financialexpress.com/wp-content/uploads/2018/02/modi-19_PTI.jpg"
        alt="Image 4"
      />

      <Array />
            <Plus />
      <Increment />
      <Effect/>
    </div>
  );
};

export default App;