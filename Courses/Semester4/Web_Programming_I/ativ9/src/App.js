import { Primeiro } from "./components/primeiro"
import { Segundo } from "./components/segundo"
import "./style.css"

// import {
//   BrowserRouter as Router,
//   Routes,
//   Route
// } from "react-router-dom";

// import { Home } from "./pages/primeiro";
// import { Login } from "./pages/segundo";

export default function App() {
  return (
    <>
    <div className="Primeiro App">
      <Primeiro/>
    </div>
    <div className="Segundo App">
      <Segundo />
    </div>
    </>
  )
}
