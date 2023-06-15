import './App.css';
import { Route,Routes } from 'react-router-dom';
import Login from './Login';
import Reg from './Reg';
// import Resetpassword from './forgot';
// import Home from './home';

function App() {
  return (
    
      <Routes>
      <Route path='/login' element={<Login/>}></Route>
       <Route path='/Reg' element={<Reg/>}></Route>
      {/* <Route path='/forgot' element={<Resetpassword/>}></Route> 
      <Route path='/home' element={<Home/>}></Route> } */}

    </Routes>
  );
}

export default App;