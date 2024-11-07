import logo from './assets/logo.svg'

function App(): JSX.Element {
  return (
    <>
      <img alt="logo" className="logo" src={logo} />
      <input type="text" className="input-student-number" placeholder="Enter Student Number" />
      <button className="enter-student-number-btn">Enter</button>
    </>
  )
}

export default App
