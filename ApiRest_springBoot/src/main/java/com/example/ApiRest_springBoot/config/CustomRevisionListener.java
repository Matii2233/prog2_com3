package com.example.ApiRest_springBoot.config;

import com.example.ApiRest_springBoot.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity;}
}
