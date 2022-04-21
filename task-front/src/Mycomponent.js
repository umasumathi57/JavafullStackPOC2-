import { useParams } from "react-router-dom"

export const Reactjs=()=>
{

    return(

        <>
        <p>Frontend Developing Language </p>
        </>
    )
}

export const Java=()=>
{
    const{ref}=useParams()

    return(
        <p>{ref} Popular Lanuage</p>
    )
}

export const Html=()=>
{
    return(

        <p>Web development Lanuage</p>
    )
}