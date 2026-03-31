import { useState } from 'react'
import './App.css'
import UserGreeting from './UserGreeting.tsx'

// Conditional Rendering = A way to allow you to control
//                         what gets runder in apps based
//                         on certain conditions.
//                        (eg. showing, hiding, or changing components)

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <UserGreeting isLoggedIn={false} username="Spongebob123"></UserGreeting>
    </>
  )
}

export default App
