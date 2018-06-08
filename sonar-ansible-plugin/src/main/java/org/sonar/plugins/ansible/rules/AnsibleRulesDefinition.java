/**
 * Copyright (c) 2018, Sylvain Baudoin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sonar.plugins.ansible.rules;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.plugins.ansible.checks.AnsibleCheckRepository;
import org.sonar.plugins.ansible.checks.CheckRepository;
import org.sonarsource.analyzer.commons.RuleMetadataLoader;
import org.sonar.plugins.yaml.languages.YamlLanguage;

import java.util.ArrayList;
import java.util.List;

public class AnsibleRulesDefinition /*implements RulesDefinition*/extends AbstractAnsibleRulesDefinition {
    public static final String RULES_DEFINITION_FOLDER = "org/sonar/l10n/ansible/rules/ansible";


    @Override
    protected String getRuleDefinitionPath() {
        return RULES_DEFINITION_FOLDER;
    }

//    @Override
//    public void define(RulesDefinition.Context context) {
//        RulesDefinition.NewRepository repository = context.createRepository(AnsibleCheckRepository.REPOSITORY_KEY, YamlLanguage.KEY).setName(AnsibleCheckRepository.REPOSITORY_NAME);
//
//        RuleMetadataLoader metadataLoader = new RuleMetadataLoader(RULES_DEFINITION_FOLDER);
//        List<Class> allCheckClasses = new ArrayList<>(CheckRepository.getCheckClasses());
//        metadataLoader.addRulesByAnnotatedClass(repository, allCheckClasses);
//
//        repository.done();
//    }
}