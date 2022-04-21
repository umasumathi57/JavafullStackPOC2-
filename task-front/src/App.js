import { Menus } from "./Navigation";
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Html, Java, Reactjs } from "./Mycomponent";


const App=()=>{
  return(
    <>
      <BrowserRouter>
        <Menus/>
          <Routes>
              <Route path="/" exact element={<Reactjs/>}></Route>
              <Route path="/second/:ref" exact element={<Java/>}></Route>
              <Route path="/third" exact element={<Html/>}></Route>

          </Routes>
      </BrowserRouter>
      
    </>
  )
}

export default App;