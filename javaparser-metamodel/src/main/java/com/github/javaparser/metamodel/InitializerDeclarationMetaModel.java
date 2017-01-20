package com.github.javaparser.metamodel;

import java.util.Optional;

public class InitializerDeclarationMetaModel extends BaseNodeMetaModel {

    InitializerDeclarationMetaModel(JavaParserMetaModel parent, Optional<BaseNodeMetaModel> superBaseNodeMetaModel) {
        super(superBaseNodeMetaModel, parent, com.github.javaparser.ast.body.InitializerDeclaration.class, "InitializerDeclaration", "com.github.javaparser.ast.body.InitializerDeclaration", "com.github.javaparser.ast.body", false);
    }
}

