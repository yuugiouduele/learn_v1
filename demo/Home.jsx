import {Variants} from"./Variant";
import './App.css';
import {Link} from "react-router-dom";

export const Home=()=>{
    return(
        
        <div className='App-header'>
            <header></header>
   <h1 className="App">ポートフォリオ作成中</h1> 
   <h2 className='App-text'>＊御用のある方は</h2>
   <div><Variants/></div>
   <Link to="/Question_HOME">こちらへどうぞ</Link>
   </div>
    )
}