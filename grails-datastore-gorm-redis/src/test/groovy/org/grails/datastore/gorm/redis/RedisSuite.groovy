package org.grails.datastore.gorm.redis

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import grails.gorm.tests.WithTransactionSpec
import grails.gorm.tests.InheritanceSpec
import grails.gorm.tests.FindByMethodSpec
import grails.gorm.tests.ListOrderBySpec
import grails.gorm.tests.ProxyLoadingSpec
import grails.gorm.tests.GroovyProxySpec
import grails.gorm.tests.DomainEventsSpec
import grails.gorm.tests.CriteriaBuilderSpec
import grails.gorm.tests.NegationSpec
import grails.gorm.tests.UpdateWithProxyPresentSpec
import grails.gorm.tests.AttachMethodSpec
import grails.gorm.tests.CircularOneToManySpec
import grails.gorm.tests.QueryAfterPropertyChangeSpec
import grails.gorm.tests.CrudOperationsSpec
import grails.gorm.tests.CommonTypesPersistenceSpec
import grails.gorm.tests.GormEnhancerSpec
import grails.gorm.tests.NamedQuerySpec
import grails.gorm.tests.OrderBySpec
import grails.gorm.tests.RangeQuerySpec
import grails.gorm.tests.ValidationSpec
import grails.gorm.tests.SaveAllSpec
import grails.gorm.tests.DeleteAllSpec

/**
 * @author graemerocher
 */
@RunWith(Suite)
@SuiteClasses([
    DomainEventsSpec,
//    ProxyLoadingSpec,
//    QueryAfterPropertyChangeSpec,
//    CircularOneToManySpec,
//    InheritanceSpec,
//    FindByMethodSpec,
//    ListOrderBySpec,
//    GroovyProxySpec,
//    CommonTypesPersistenceSpec,
//    GormEnhancerSpec,
//    CriteriaBuilderSpec,
//    NegationSpec,
//    NamedQuerySpec,
//    OrderBySpec,
//    RangeQuerySpec,
//    ValidationSpec,
//    UpdateWithProxyPresentSpec,
//    AttachMethodSpec,
//    WithTransactionSpec,
//    CrudOperationsSpec
SaveAllSpec,
DeleteAllSpec
])
class RedisSuite {
}
