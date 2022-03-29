package com.example.junittest

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class LocationESRule: TestRule {

    var assertion: Assertion? = null

    override fun apply(base: Statement?, description: Description?): Statement {
        return object : Statement() {
            override fun evaluate() {
                assertion = Assertion()
                assertion?.setLocatin("ES")
                base?.evaluate()

                try {
                    base?.evaluate()
                }finally {
                    assertion = null
                }
            }

        }
    }
}