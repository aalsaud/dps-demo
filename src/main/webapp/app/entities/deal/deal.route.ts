import {Route} from '@angular/router';

import {AddDealComponent} from 'app/entities/deal/add-deal.component';

export const dealRoute: Route = {
    path: 'add',
    component: AddDealComponent,
    data: {
        authorities: ['ROLE_USER'],
        pageTitle: 'add-deal.title'
    }
};
