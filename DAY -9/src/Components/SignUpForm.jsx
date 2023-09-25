import React, { useState } from 'react';
import './signup-style.css';
import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';
import { useDispatch } from 'react-redux';
import { signup } from '../Features/user';

const SignUpForm =() => {


    const[username, setUsername] = useState("");
    const[email, setemail] = useState("");
    const[password, setpassword] = useState("");

    const dispatch =useDispatch()

    const handleUserNameChange = (e) => {
        setUsername(e.target.value); 
    };

    const handleEmailChange = (e) => {
        setemail(e.target.value);

    };
    const handlePasswordChange = (e) => {
        setpassword(e.target.value);
    };

        let history = useHistory();

const handleSubmit = (e) => {
    e.preventDefault();
    if(email.trim()&& username.trim() && password.trim()){

        history.push('/Dashboard')
    }
};

    return (
        <div>
            {/* <header>
                <div className="login_header">
                
                </div>
            </header> */}
            <body className="login_body">
                <div className="signup_form">
                    <div className="login_form_title">SIGNUP</div>

                    <form
                        onSubmit={handleSubmit}
                        className="login_inputs"
                        action="/login"
                        method="post"
                    >
                        <fieldset className="login-group">
                            <label className='signup-label'>User Name</label>
                            <input
                                onChange={handleUserNameChange}
                                type="text"
                                className="login-control"
                                name="username"
                                required
                            />
                        </fieldset>
                        <fieldset className="login-group">
                            <label className='signup-label'>Email</label>
                            <input
                                onChange={handleEmailChange}
                                type="text"
                                className="login-control"
                                name="email"
                                required
                            />
                        </fieldset>

                        <fieldset className="login-group">
                            <label className='signup-label'>Password</label>
                            <input
                                onChange={handlePasswordChange}
                                type="password"
                                className="login-control"
                                name="password"
                                required
                            />
                        </fieldset>

                        <div className="button_position">
                            <button type="submit" className="signup_button"onClick={()=>dispatch(signup({username:username,email:email,password:password}))}>
                                SignUp
                            </button>
                            <p className='p-position'>OR</p>
                        </div>

                        <a href="/login" className="signup_button n_2">
                            Login
                        </a>
                    </form>

                </div>
            </body>
        </div>
    );
}

export default SignUpForm;
