
export function BasicList() {
    const fruits = [
        "apple", "pear", "orange",
        "banana", "coconut", "pineapple",
        "peach", "tomato"
    ];

    // JS builting sort func, sorts in-place LEXIOGRAPHICALLY
    // (doesn't work with numbers)
    fruits.sort( (a, b) => b.localeCompare(a) );
    //fruits.sort( (a, b) => a.localeCompare(b) );

    // Maps/transforms each individual fruit item!!!
    const listItems = fruits.map( fruit => (
        <li>{fruit}</li>)
    );

    return (<ol>{listItems}</ol>); // Returns a tag of fruits
}

export type fruit = {
    id: number,
    name : string,
    calories: number
};

export function List() {
    const fruits : Array<fruit> = [
        {id: 1, name: "apple", calories: 96}, 
        {id: 2, name: "pear", calories: 85}, 
        {id: 3, name: "orange", calories: 45},
        {id: 4, name: "banana", calories: 100}, 
        {id: 5, name: "coconut", calories: 125}, 
        {id: 6, name: "pineapple", calories: 65},
        {id: 7, name: "peach", calories: 105}, 
        {id: 8, name: "tomato", calories: 132}
    ];

    // Sort by name!!!
    // most builtin sorts follow the (a, b) pattern!
    // use localecompare for strings like always!
    //fruits.sort( (a, b) => a.name.localeCompare(b.name));
    //fruits.sort( (a, b) => b.name.localeCompare(a.name));

    // Sort by calories
    //fruits.sort( (a, b) => a.calories - b.calories) // ascending
    fruits.sort( (a, b) => b.calories - a.calories);

    // --- FILTERING ---
    // use the .filter func!
    //const lowCalFruit = fruits.filter( fruit => fruit.calories < 100);
    const highCalFruit = fruits.filter( fruit => fruit.calories >= 100);

    // Maps/transforms each individual fruit item!!!
    
    // "REACT wants each item to have a key - else it displays console warnings"
    const listItems = highCalFruit.map( highCalFruit => (
        <li key={highCalFruit.name}>
            {highCalFruit.name}: &nbsp; 
            <b>{highCalFruit.calories}</b>
        </li>)
    );

    return (<ol>{listItems}</ol>); // Returns a tag of fruits
}
