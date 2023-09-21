import logo from './logo.svg';
import './App.css';
import LoginForm from './Components/LoginForm';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import SignUpForm from './Components/SignUpForm';

function App() {
  return (
    <div className="App">
      <Router>
        <Switch>
          <Route exact path='/' component={SignUpForm} />
          <Route exact path='/login' component={LoginForm} />
        </Switch>
      </Router>


    </div>
  );
}

export default App;
