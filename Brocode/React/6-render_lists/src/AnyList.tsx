import type { fruit } from './List';

function AnyList(props: {items: Array<fruit>, category: string}) {

    // Get the array and category
    const itemList = props.items;
    const category = props.category;

    // Make a readable map of corresponding li components
    const listItems = itemList.map( item => (
            <li key={item.id}>
                {item.name}: &nbsp;
                <b>{item.calories}</b>
            </li>
    )
    )

    return (
    <>
    <h3 className="list-category">{category}</h3>
    <ol className="list-items">{listItems}</ol>
    </>
    )
}

AnyList.defaultProps = {
    category: "Category",
    items: []
}

export default AnyList;