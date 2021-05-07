const plantenLijstDiv = document.querySelector("#plantLijst");
const planten = [];
const url = "http://localhost:8082";

const fetchAllePlanten = async () => {
  const res = await superagent.get(`${url}/alleplanten`);
  res.body.map((i) => planten.push(i));
  printPlanten();
};

const printPlanten = () => {
  planten.map((plant) => {
    const { naam, hoogte, prijs, leefgebied, id } = plant;

    const kader = document.createElement("div");
    kader.classList.add("plant");

    const p1 = document.createElement("p");
    p1.innerText = `${id} ${naam != null ? naam : ""}, ${
      leefgebied != null ? leefgebied : ""
    }`;
    kader.appendChild(p1);
    const p2 = document.createElement("p");
    p2.innerText = `${hoogte}cm, ${prijs}euro`;
    kader.appendChild(p2);
    plantenLijstDiv.appendChild(kader);
  });
};

const inputs = [...document.querySelectorAll("input")];
const form = document.querySelector('form')

// inputs.forEach(input => input.addEventListener('change', () => {}))

form.addEventListener('submit', e =>{
  e.preventDefault();
  const body ={
    naam: inputs[0].value,
    leefgebied: inputs[1].value,
    prijs: inputs[2].value,
    hoogte: inputs[3].value
  }
  superagent.post(`${url}/voegplanttoe`).send(body).end((err, res)=> {console.log(err)})
})

