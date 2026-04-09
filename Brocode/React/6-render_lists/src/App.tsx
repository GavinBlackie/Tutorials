import {List} from './List';
import AnyList from './AnyList';
import './index.css';

function App() {
  
  const fruits = [
      {id: 1, name: "apple", calories: 96}, 
      {id: 2, name: "pear", calories: 85}, 
      {id: 3, name: "orange", calories: 45},
      {id: 4, name: "banana", calories: 100}, 
      {id: 5, name: "coconut", calories: 125}, 
      {id: 6, name: "pineapple", calories: 65},
      {id: 7, name: "peach", calories: 105}, 
      {id: 8, name: "tomato", calories: 132}
  ];

  const vegtables = [
      {id: 9, name: "potato", calories: 110},
      {id: 10, name: "carrot", calories: 64},
      {id: 11, name: "corn", calories: 25},
      {id: 12, name: "celery", calories: 15},
      {id: 13, name: "broccoli", calories: 50},
  ];

  return(
  <>
  <List/>

  <div></div>
  
  {fruits.length > 0 ? 
  <AnyList items={fruits} ></AnyList>
  : null}

  {vegtables.length > 0 && 
    <AnyList items={vegtables} category="Vegtables"/>
  }

  </>
  )
}

export default App
