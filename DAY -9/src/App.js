import logo from './logo.svg';
import './App.css';
import LoginForm from './Components/LoginForm';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import SignUpForm from './Components/SignUpForm';
import Navbar from './Components/Navbar';
import Dashboard from './Components/Dashboard';
import Header from './Components/common/header/Header';
import Home from './Components/home/Home';
import About from "./Components/about/About"
import CourseHome from './Components/allcourses/CourseHome';





function App() {
  return (
    <div className="App">
      <Router>
        <Switch>
          <Route exact path='/' component={SignUpForm} />
          <Route exact path='/login' component={LoginForm} />
          {/* <Route exact path='/Navbar' component={Navbar} /> */}
          <Route exact path='/Dashboard' component={Dashboard} />
          <Route exact path='/Header' component={Header} />    
          <Route exact path='/about' component={About} />    
          <Route exact path='/courses' component={CourseHome} />    
          
         
        </Switch>
      </Router>


    </div>
  );
}

export default App;
