import logo from './logo.svg';
import './App.css';
import LoginForm from './Components/LoginForm';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import SignUpForm from './Components/SignUpForm';
import Navbar from './Components/Navbar';
import Home from './Components/Home';


function App() {
  return (
    <div className="App">
      <Router>
        <Switch>
          <Route exact path='/' component={SignUpForm} />
          <Route exact path='/login' component={LoginForm} />
          <Route exact path='/Navbar' component={Navbar} />
          <Route exact path='/Home' component={Home} />
         
        </Switch>
      </Router>


    </div>
  );
}

export default App;
