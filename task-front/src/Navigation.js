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
        <Nav.Link active href="/">Main1</Nav.Link>
        <Nav.Link  href="/second">Main2</Nav.Link>
        <Nav.Link  href="/third">Main3</Nav.Link>

      </Nav>
    </Navbar.Collapse>
  </Container>
</Navbar>
</>
)
  
}