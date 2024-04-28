
import {BrowserRouter,Link,Route,Routes} from "react-router-dom";
import  { SignUp } from "./Sign/SignUp_j";
import {Home} from './Home';

import {Dashboard} from './Chart/Dashboard';
import { Checkout } from './Card/Checkout';
import {Blog} from './Blog/Blog';
import { LandingPage } from "./News/LandingPage";
import { Blog2 } from "./News_Info/Blog";
import { SignInSide } from "./Sign/SignInSide";
import { TradePage } from "./Trade/TradePage";
import { BalanceSheet } from "./Balance/BalanceSheet";
import { ChatBot } from "./Chart/ChatBot";
import { Point } from "./Point/Point";
import { Ecsite } from "./EC/EC";


export function LinkControl(){
    

    return(
        <BrowserRouter>
        <Link to="/HOME">ホーム</Link>
        
            <Routes>
            <Route path="/HOME" element={<Home/>}/>    
            <Route path="/Question_HOME" element={<SignUp/>}/>
            <Route path="/Question_HOME/Sign" element={<SignInSide/>}/>
            <Route path="/Chart_HOME" element={<Dashboard/>}/> 
            <Route path="/Trade_HOME" element={<TradePage/>}/> 
            <Route path="/Card_HOME" element={<Checkout/>}/> 
            <Route path="/Balance_HOME" element={<BalanceSheet/>}/> 
            <Route path="/Blog_HOME" element={<Blog/>}/> 
            <Route path="/Point_HOME" element={<Point/>}/> 
            <Route path="/ChatBot_HOME" element={<ChatBot/>}/> 
            <Route path="/News_HOME" element={<LandingPage/>}/> 
            <Route path="/News_Info_HOME" element={<Blog2/>}/> 
            <Route path="/Ecsite_HOME" element={<Ecsite/>}/>

            </Routes>
        </BrowserRouter>

    )
}

export default LinkControl;