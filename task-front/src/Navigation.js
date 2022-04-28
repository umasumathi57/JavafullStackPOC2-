import {Container, Nav, Navbar} from 'react-bootstrap'


export const Menus=()=>{

return(
    <>
<Navbar bg="warning" expand="lg">
  <Container fluid>
    <Navbar.Brand href="#home"> Menu</Navbar.Brand>
    <Navbar.Toggle aria-controls="Sample" />
    <Navbar.Collapse id="Sample">
      <Nav className="ms-auto">
        <Nav.Link active href="/sign">New Account</Nav.Link>
        <Nav.Link  href="/">Login</Nav.Link>
        <Nav.Link  href="/home">Home</Nav.Link>

      </Nav>
    </Navbar.Collapse>
  </Container>
</Navbar>
</>
)
  
}