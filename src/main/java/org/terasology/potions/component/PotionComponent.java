/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.potions.component;

import com.google.common.collect.Lists;
import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

import java.util.List;

/**
 * This component is used for storing information about a potion. Specifically, what potion bottle it came from, the
 * durability cost per drink, whether it has a genome, and all of the potion's effects.
 */
public final class PotionComponent implements Component {
    /** Can this potion bottle be reused indefinitely. */
    @Replicate
    public boolean hasInfDurability = false;

    /** Name of the empty bottle prefab. */
    @Replicate
    public String bottlePrefab = "Potions:GlassBottle";

    /** What's the durability cost per drink. */
    @Replicate
    public int costPerDrink = 3;

    /**
     * Flag for storing whether this potion has a genome. If a potion has been predefined by a developer, set this to
     * false.
     */
    public boolean hasGenome = true;

    /** List of PotionEffects that this potion has. */
    @Replicate
    public List<PotionEffect> effects = Lists.newArrayList();
}