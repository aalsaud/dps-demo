import {Route} from '@angular/router';

import {ListDealsComponent} from 'app/entities/deal/list-deals/list-deals.component';

export const listDealRoute: Route = {
    path: 'list',
    component: ListDealsComponent,
    data: {
        authorities: [],
        pageTitle: 'list-deals.title'
    }
};
