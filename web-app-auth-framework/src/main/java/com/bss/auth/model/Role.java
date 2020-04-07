package com.bss.auth.model;

import com.bss.framework.core.schema.model.Base;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Created by Akshay Misra on 15-11-2018.
 */
@Document(collection = "roles")
public class Role extends Base {

    public Role(String name) {
        this.setName(name);
    }

    public Role(String name, String description) {
        this.setName(name);
        this.setDescription(description);
    }

    @DBRef
    private Set<Permission> permissions;

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return String.format(
                "Role[id=%s, " +
                        "name='%s', " +
                        "description='%s']",
                getId(), getName(), getDescription());
    }
}
