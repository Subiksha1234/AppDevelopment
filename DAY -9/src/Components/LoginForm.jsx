import React from 'react';
import './login-page-style.css';
import { useState } from 'react';
import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';

const LoginForm = () => {
  const [email, setemail] = useState("");
  const [password, setpassword] = useState("");

  const handleEmailChange = (e) => {
    setemail(e.target.value);

  };
  const handlePasswordChange = (e) => {
    setpassword(e.target.value);
  };

  // let history = useHistory();

  const handleSubmit = (e) => {
    e.preventDefault();
  };
  return (
    <div>
      {/* <header>
        <div className="login_header">
          
        </div>
      </header> */}
      <body className="login_body">
        <div className="login_form">
          <div className="login_form_title">LOGIN</div>

          <form
          onSubmit={handleSubmit}
            className="login_inputs"
            action="/login"
            method="post"
          >
            <fieldset className="login-group">
              <label className='login-label'>Email</label>
              <input
              onChange={handleEmailChange}
                type="email"
                className="login-control"
                name="username"
                required
              />
            </fieldset>
            <fieldset className="login-group">
              <label className='login-label'>Password</label>
              <input
              onChange={handlePasswordChange}
                type="password"
                className="login-control"
                name="password"
                required
              />
            </fieldset>

            <div className="button_position">
              <button type="submit" className="login_button">
                LogIn
              </button>
              <p className='p-position'>OR</p>
            </div>
            <a href="/" className="login_button l_2">
              REGISTRATION
            </a>
          </form>

        </div>
      </body>
    </div>
  );
}


export default LoginForm;