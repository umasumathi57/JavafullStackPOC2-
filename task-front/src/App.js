import { Menus } from "./Navigation";
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Html, Java, Reactjs } from "./Mycomponent";
import { NewAccount } from "./SignUp.js";
import { Login } from "./Login";
import { Home } from "./Home";

const App=()=>{
  return(
    <>
      <BrowserRouter>
        <Menus/>
          <Routes>
             <Route path="/sign" exact element={<NewAccount/>}/> 
              <Route path="/" exact element={<Login/>}/> 

              {/* <Route path="/second/:ref" exact element={<Java/>}/> */}
              <Route path="/home" exact element={<Home/>}/>

          </Routes>
      </BrowserRouter>
      
    </>
  )
}

export default App;