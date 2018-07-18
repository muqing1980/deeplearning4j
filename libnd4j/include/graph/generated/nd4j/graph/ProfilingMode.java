/*******************************************************************************
 * Copyright (c) 2015-2018 Skymind, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

// automatically generated by the FlatBuffers compiler, do not modify

package nd4j.graph;

public final class ProfilingMode {
  private ProfilingMode() { }
  public static final byte NONE = 0;
  public static final byte NAN_PANIC = 1;
  public static final byte INF_PANIC = 2;
  public static final byte ANY_PANIC = 3;

  public static final String[] names = { "NONE", "NAN_PANIC", "INF_PANIC", "ANY_PANIC", };

  public static String name(int e) { return names[e]; }
}

