import axios from "axios";
import { OrderPayload } from "./Orders/types";

const URL_BASE = "https://pizza-d-app.herokuapp.com"
const mapboxToken = process.env.REACT_APP_ACCESS_TOKEN_MAPBOX

export function fetchProducts(){
  return axios(URL_BASE+'/products')
}

export function fetchLocalMapBox(local: string){
  return axios(`https://api.mapbox.com/geocoding/v5/mapbox.places/${local}.json?access_token=${mapboxToken}`)
}

export function saveOrder(payload: OrderPayload){
  return axios.post(URL_BASE+'/orders', payload)
}