import {useEffect, useState} from "react";
import Nav from "./Nav";
import { Route, Routes , BrowserRouter} from "react-router-dom";
import Main from "./Main";
import PostList from "./PostList"
import PostDetail from "./PostDetail";
function App() {


    return (
        <div>
          <BrowserRouter>
            <Nav/>
            <Routes>
              <Route path={"/"} exact element={<Main/>}/>
              <Route path={"/post/list/:co_num"} element={<PostList/>}/>
              <Route path={"/post/detail/:po_num"} element={<PostDetail/>}/>
            </Routes>
        </BrowserRouter>
        </div>
    );
}

export default App;
