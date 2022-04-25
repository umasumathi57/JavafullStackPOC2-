import { Menus } from "./Navigation";
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Html, Java, Reactjs } from "./Mycomponent";
import { NewAccount } from "./SignUp.js";
import { Login } from "./Login";

const App=()=>{
  return(
    <>
      <BrowserRouter>
        <Menus/>
          <Routes>
             {/* <Route path="/" exact element={<NewAccount/>}/> */}
              <Route path="/" exact element={<Login/>}/>

              <Route path="/second/:ref" exact element={<Java/>}/>
              <Route path="/third" exact element={<Html/>}/>

          </Routes>
      </BrowserRouter>
      
    </>
  )
}

export default App;