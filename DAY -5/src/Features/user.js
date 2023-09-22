import {createSlice} from '@reduxjs/toolkit';

export const userSlice = createSlice({
name:'user',
initialState : {value:{username:'',email:'',password:''}},
reducers:{
    signup:(state,action)=>{
        state.value=action.payload
    }
}
});
export default userSlice.reducer;
export const {signup}=userSlice.actions; 