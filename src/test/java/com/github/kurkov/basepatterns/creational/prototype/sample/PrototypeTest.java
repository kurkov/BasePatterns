package com.github.kurkov.basepatterns.creational.prototype.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class PrototypeTest {

    @Test
    public void comparePrototypeToOriginalObject() {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        assertEquals(master.getId(), masterClone.getId());
        assertEquals(master.getProjectName(), masterClone.getProjectName());
        assertEquals(master.getSourceCode(), masterClone.getSourceCode());

        assertNotEquals(master.hashCode(), masterClone.hashCode());
    }
}