/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary")
@TestDataPath("$PROJECT_ROOT")
public class LibraryGetOrBuildFirTestGenerated extends AbstractLibraryGetOrBuildFirTest {
  @Test
  public void testAllFilesPresentInGetOrBuildFirBinary() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("dataClass.kt")
  public void testDataClass() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/dataClass.kt");
  }

  @Test
  @TestMetadata("delegate.kt")
  public void testDelegate() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/delegate.kt");
  }

  @Test
  @TestMetadata("enumEntry.kt")
  public void testEnumEntry() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/enumEntry.kt");
  }

  @Test
  @TestMetadata("functionWithDefinitelyNotNullParameter.kt")
  public void testFunctionWithDefinitelyNotNullParameter() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/functionWithDefinitelyNotNullParameter.kt");
  }

  @Test
  @TestMetadata("genericsOnNestedClasses.kt")
  public void testGenericsOnNestedClasses() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/genericsOnNestedClasses.kt");
  }

  @Test
  @TestMetadata("parameter.kt")
  public void testParameter() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/parameter.kt");
  }

  @Test
  @TestMetadata("secondaryConstructor.kt")
  public void testSecondaryConstructor() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/secondaryConstructor.kt");
  }

  @Test
  @TestMetadata("simpleClass.kt")
  public void testSimpleClass() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleClass.kt");
  }

  @Test
  @TestMetadata("simpleConstructor.kt")
  public void testSimpleConstructor() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleConstructor.kt");
  }

  @Test
  @TestMetadata("simpleFunction.kt")
  public void testSimpleFunction() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleFunction.kt");
  }

  @Test
  @TestMetadata("simpleProperty.kt")
  public void testSimpleProperty() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleProperty.kt");
  }

  @Test
  @TestMetadata("topLevelFunction.kt")
  public void testTopLevelFunction() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/topLevelFunction.kt");
  }

  @Test
  @TestMetadata("typeParameter.kt")
  public void testTypeParameter() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/typeParameter.kt");
  }

  @Test
  @TestMetadata("typealiasUnsignedConst.kt")
  public void testTypealiasUnsignedConst() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/typealiasUnsignedConst.kt");
  }

  @Test
  @TestMetadata("unsignedConst.kt")
  public void testUnsignedConst() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/unsignedConst.kt");
  }

  @Nested
  @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource")
  @TestDataPath("$PROJECT_ROOT")
  public class ContainerSource {
    @Test
    public void testAllFilesPresentInContainerSource() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js")
    @TestDataPath("$PROJECT_ROOT")
    public class Js {
      @Test
      public void testAllFilesPresentInJs() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("memberFunction.kt")
      public void testMemberFunction() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js/memberFunction.kt");
      }

      @Test
      @TestMetadata("memberProperty.kt")
      public void testMemberProperty() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js/memberProperty.kt");
      }

      @Test
      @TestMetadata("primaryConstructor.kt")
      public void testPrimaryConstructor() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js/primaryConstructor.kt");
      }

      @Test
      @TestMetadata("secondaryConstructor.kt")
      public void testSecondaryConstructor() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js/secondaryConstructor.kt");
      }

      @Test
      @TestMetadata("topLevelFunction.kt")
      public void testTopLevelFunction() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js/topLevelFunction.kt");
      }

      @Test
      @TestMetadata("topLevelProperty.kt")
      public void testTopLevelProperty() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/js/topLevelProperty.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm")
    @TestDataPath("$PROJECT_ROOT")
    public class Jvm {
      @Test
      public void testAllFilesPresentInJvm() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("memberFunction.kt")
      public void testMemberFunction() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/memberFunction.kt");
      }

      @Test
      @TestMetadata("memberProperty.kt")
      public void testMemberProperty() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/memberProperty.kt");
      }

      @Test
      @TestMetadata("primaryConstructor.kt")
      public void testPrimaryConstructor() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/primaryConstructor.kt");
      }

      @Test
      @TestMetadata("secondaryConstructor.kt")
      public void testSecondaryConstructor() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/secondaryConstructor.kt");
      }

      @Test
      @TestMetadata("topLevelFunction.kt")
      public void testTopLevelFunction() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/topLevelFunction.kt");
      }

      @Test
      @TestMetadata("topLevelFunctionWithJvmName.kt")
      public void testTopLevelFunctionWithJvmName() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/topLevelFunctionWithJvmName.kt");
      }

      @Test
      @TestMetadata("topLevelProperty.kt")
      public void testTopLevelProperty() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/topLevelProperty.kt");
      }

      @Test
      @TestMetadata("topLevelPropertyWithJvmName.kt")
      public void testTopLevelPropertyWithJvmName() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/jvm/topLevelPropertyWithJvmName.kt");
      }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata")
    @TestDataPath("$PROJECT_ROOT")
    public class Metadata {
      @Test
      public void testAllFilesPresentInMetadata() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("memberFunction.kt")
      public void testMemberFunction() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata/memberFunction.kt");
      }

      @Test
      @TestMetadata("memberProperty.kt")
      public void testMemberProperty() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata/memberProperty.kt");
      }

      @Test
      @TestMetadata("primaryConstructor.kt")
      public void testPrimaryConstructor() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata/primaryConstructor.kt");
      }

      @Test
      @TestMetadata("secondaryConstructor.kt")
      public void testSecondaryConstructor() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata/secondaryConstructor.kt");
      }

      @Test
      @TestMetadata("topLevelFunction.kt")
      public void testTopLevelFunction() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata/topLevelFunction.kt");
      }

      @Test
      @TestMetadata("topLevelProperty.kt")
      public void testTopLevelProperty() {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/containerSource/metadata/topLevelProperty.kt");
      }
    }
  }

  @Nested
  @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js")
  @TestDataPath("$PROJECT_ROOT")
  public class Js {
    @Test
    public void testAllFilesPresentInJs() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classAnnotation.kt")
    public void testClassAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/classAnnotation.kt");
    }

    @Test
    @TestMetadata("constructorAnnotation.kt")
    public void testConstructorAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/constructorAnnotation.kt");
    }

    @Test
    @TestMetadata("dynamic.kt")
    public void testDynamic() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/dynamic.kt");
    }

    @Test
    @TestMetadata("enumAnnotation.kt")
    public void testEnumAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/enumAnnotation.kt");
    }

    @Test
    @TestMetadata("fileJsModule.kt")
    public void testFileJsModule() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/fileJsModule.kt");
    }

    @Test
    @TestMetadata("functionAnnotation.kt")
    public void testFunctionAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/functionAnnotation.kt");
    }

    @Test
    @TestMetadata("jQueryExample.kt")
    public void testJQueryExample() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/jQueryExample.kt");
    }

    @Test
    @TestMetadata("parameterAnnotation.kt")
    public void testParameterAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/parameterAnnotation.kt");
    }

    @Test
    @TestMetadata("propertyAnnotation.kt")
    public void testPropertyAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/propertyAnnotation.kt");
    }

    @Test
    @TestMetadata("typeAnnotation.kt")
    public void testTypeAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/typeAnnotation.kt");
    }

    @Test
    @TestMetadata("typeParameterAnnotation.kt")
    public void testTypeParameterAnnotation() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/js/typeParameterAnnotation.kt");
    }
  }

  @Nested
  @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi")
  @TestDataPath("$PROJECT_ROOT")
  public class PublishedApi {
    @Test
    public void testAllFilesPresentInPublishedApi() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("publishedApiClass.kt")
    public void testPublishedApiClass() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiClass.kt");
    }

    @Test
    @TestMetadata("publishedApiConstructor.kt")
    public void testPublishedApiConstructor() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiConstructor.kt");
    }

    @Test
    @TestMetadata("publishedApiFunction.kt")
    public void testPublishedApiFunction() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiFunction.kt");
    }

    @Test
    @TestMetadata("publishedApiPrimaryConstructor.kt")
    public void testPublishedApiPrimaryConstructor() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("publishedApiProperty.kt")
    public void testPublishedApiProperty() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiProperty.kt");
    }

    @Test
    @TestMetadata("publishedApiPropertyGetter.kt")
    public void testPublishedApiPropertyGetter() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiPropertyGetter.kt");
    }

    @Test
    @TestMetadata("publishedApiPropertySetter.kt")
    public void testPublishedApiPropertySetter() {
      runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiPropertySetter.kt");
    }
  }
}
