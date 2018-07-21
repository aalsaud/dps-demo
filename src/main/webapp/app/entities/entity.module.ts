import {CUSTOM_ELEMENTS_SCHEMA, NgModule} from '@angular/core';
import {AddDealComponent} from './deal/add-deal.component';
import {RouterModule} from '@angular/router';
import {DpsAppSharedModule} from 'app/shared';
import {dealState} from 'app/entities/entity.route';
import {ListDealsComponent} from './deal/list-deals/list-deals.component';

/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [DpsAppSharedModule, RouterModule.forChild(dealState)],
    declarations: [AddDealComponent, ListDealsComponent],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DpsAppEntityModule {}
