import axios from 'axios'

const url= "http://localhost:8080"

export const adding=async(object)=>{

    const temp=await axios.post(`${url}/newacc`,object)
    return temp;
}