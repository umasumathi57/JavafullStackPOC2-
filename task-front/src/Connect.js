import axios from 'axios'

//const url=""
export const adding=async(object)=>{

    const t=await axios.post(`${url}/newacc`,object)
}