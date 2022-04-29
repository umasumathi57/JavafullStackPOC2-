import { useEffect, useState } from "react";
import { DataGrid } from '@mui/x-data-grid';


export const Transaction01=()=>{

    const columns = [
        { field: 'id', headerName: 'ID', width: 200 },
        { field: 'amount', headerName: 'Amount', width: 200 },
        { field: 'dot', headerName: 'Date of the Transaction', width: 300 },
        {
          field: 'type',
          headerName: 'Transaction Type',
          width: 200,
        },
        {
            field: 'account',
            headerName: 'Involved Account',
            width:250,
        },  
      ];

    const[arr,setArr]=useState([])

    const hey=async()=>{
        
    }

    useEffect(()=>{
        hey()
    },[])

    return(
        <>
            <div className="row justify-content-center">
            <div style={{ height: 500, width: '100%' }}>
                <DataGrid
                    columns={columns}
                    pageSize={7}
                    rowsPerPageOptions={[7]}
                />
            </div>
        </div>
        
        </>
    )
}