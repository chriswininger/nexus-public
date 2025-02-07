/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.cleanup.internal.datastore.search.criteria;

import java.util.function.Predicate;

import org.sonatype.nexus.repository.Repository;
import org.sonatype.nexus.repository.content.Asset;

/**
 * An evaluator of a cleanup policy criteria which is only concerned with an Asset
 *
 * @since 3.next
 */
public interface AssetCleanupEvaluator
{
  /**
   * Creates a predicate which indicates whether the asset is eligible for cleanup.
   *
   * @param repository  the source repository for the assets which will be fed into the predicate
   * @param value       the value associated with the CleanupPolicy for use with this criteria
   * @return            the predicate
   */
  Predicate<Asset> getPredicate(Repository repository, String value);
}
