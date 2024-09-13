import {useEffect, useState} from "react";
import Nav from "./Nav";
import { Route, Routes , BrowserRouter} from "react-router-dom";
import Main from "./Main";
import PostList from "./PostList"
function App() {


    return (
        <div>
          <BrowserRouter>
            <Nav/>
            <Routes>
              <Route path={"/"} exact element={<Main/>}/>
              <Route path={"/post/list/:co_num"} element={<PostList/>}/>
            </Routes>
        </BrowserRouter>
        </div>
    );
}

export default App;
