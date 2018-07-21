import {Routes} from '@angular/router';

import {dealRoute} from './deal/deal.route';
import {listDealRoute} from 'app/entities/deal/list-deals/list-deal.route';

const DEAL_ROUTES = [
    dealRoute,
    listDealRoute
];

export const dealState: Routes = [
    {
        path: 'deal',
        children: DEAL_ROUTES
    }
];
