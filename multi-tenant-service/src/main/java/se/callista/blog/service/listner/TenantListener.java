package se.callista.blog.service.listner;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import se.callista.blog.service.multi_tenancy.util.TenantContext;

public class TenantListener {

    @PreUpdate
    @PreRemove
    @PrePersist
    public void setTenant(TenantAware entity) {
        final String tenantId = TenantContext.getTenantId();
        entity.setTenantId(tenantId);
    }
}
