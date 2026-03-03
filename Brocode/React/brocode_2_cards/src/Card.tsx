import spongebobImage from "./assets/spongebob.jpg";

function Card() {
    return(
        <div className="card">
            <img className={"card-image"}
                src={spongebobImage} alt="a picture of spongebob!"
                ></img>
            <h2 className={"card-title"}>Spongebob Squarepants</h2>
            <p className={"card-text"}>A friendly frycook!</p>
        </div>
    );
}

export default Card;