import {combineReducers} from 'redux';
import CarsReducers from './car';

const allReducers = combineReducers({
    cars: CarsReducers
});

export default allReducers;