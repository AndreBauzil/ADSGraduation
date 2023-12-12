import { Primeiro } from "./components/primeiro"
import { Segundo } from "./components/segundo"
import { Terceiro } from "./components/terceiro"
import { Quarto } from "./components/quarto"
import "./style.css"

export default function App() {
  return (
    <>
    <div className="Primeiro App">
      <Primeiro/>
    </div>
    <div className="Segundo App">
      <Segundo />
    </div>
    <div className="Terceiro App">
      <Terceiro />
    </div>
    <div className="Quarto App">
      <Quarto />
    </div>
    
    </>
  )
}
